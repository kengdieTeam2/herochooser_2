package org.herochooser.room

import org.herochooser.model.Hero

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午11:22
 * To change this template use File | Settings | File Templates.
 */
class RoomObject {
    private Object roomLock = new Object()
    private ArrayList<Role> roles = new ArrayList<Role>()
    private arr = [
            4   : [0, 1, 2, 3],
            5   : [0, 1, 2, 2, 3],
            6   : [0, 1, 1, 2, 2, 3],
            7   : [0, 1, 1, 2, 2, 2, 3],
            8   : [0, 1, 1, 2, 2, 2, 2, 3],
            9   : [0, 1, 1, 1, 2, 2, 2, 2, 3],
            10  : [0, 1, 1, 1, 2, 2, 2, 2, 2, 3]
    ]
    private int roleCount = 0
    int turnIndex = 0


    def join(Role role){
        if(roles.size() >=  roleCount) return null
        roles << role
        role.roomIndex = roles.size() - 1

        if(roles.size() ==  roleCount){
            def thisArr = arr.get(roleCount)
            roles.each {Role it ->
                it.type = thisArr.remove((Math.random() * thisArr.size()).intValue())
                if(it.type == 0) it.turnIndex = 0
            }
        }
        role
    }

    def randomHero(Role role){
        def flag = true
        List<Hero> heros
        synchronized (roomLock){
            while (flag){
                if(role.turnIndex != turnIndex){
                    roomLock.wait()
                }else{
                    roomLock.notifyAll()
                    flag = false
                }
            }
        }
        return heros
    }
}
