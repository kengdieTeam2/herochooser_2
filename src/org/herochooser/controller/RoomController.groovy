package org.herochooser.controller

import com.jfinal.core.Controller
import org.herochooser.room.*

import static org.herochooser.room.RoomArray.*

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午11:49
 * To change this template use File | Settings | File Templates.
 */
class RoomController extends Controller{

    def query(){

    }

    def create(){
        def room = RoomArray.create()
        room.join(getSessionAttr("role"))
        renderJson(room)
    }

    def list(){

    }

    def join(){
        RoomObject room = query(getParaToInt("id"))
        room << getSessionAttr("role")
        setSessionAttr("room", room)
        room.notifyAll()
        renderJson([success: true])
    }
}
