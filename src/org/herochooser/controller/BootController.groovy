package org.herochooser.controller

import com.jfinal.core.Controller
import org.herochooser.room.RoomArray
import org.herochooser.room.RoomBuilder
import org.herochooser.room.RoomObject

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午8:31
 * To change this template use File | Settings | File Templates.
 */
class BootController extends Controller{
    def index(){
        if(getSessionAttr("role"))
            setSessionAttr("role", RoomBuilder.entry())
        render("/index.jsp")
    }
}
