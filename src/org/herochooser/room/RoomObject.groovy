package org.herochooser.room

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午11:22
 * To change this template use File | Settings | File Templates.
 */
class RoomObject {
    private ArrayList<Role> roles = new ArrayList<Role>()

    def join(Role role){
        roles << role
        role.roomIndex = roles.size() - 1
        role
    }

}
