package org.herochooser.room

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午11:37
 * To change this template use File | Settings | File Templates.
 */
class RoomBuilder {
    private static ArrayList<Role> roles = new ArrayList<Role>()

    static def entry(){
        def roleIndex = roles.size()
        def role = new Role(id: roleIndex)
        roles << role
        role
    }
}
