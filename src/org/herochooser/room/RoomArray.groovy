package org.herochooser.room

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午11:21
 * To change this template use File | Settings | File Templates.
 */
class RoomArray {
    private static ArrayList<RoomObject> roomObjects = new ArrayList<RoomObject>()

    static def query(int index){
        roomObjects.get(index)
    }

    static def create(){
        def room = new RoomObject()
        roomObjects << room
        roomObjects.size() - 1
        room
    }
}
