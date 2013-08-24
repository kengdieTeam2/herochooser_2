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
    static Object lock = new Object()
    def index(){
        if(getSessionAttr("role"))
            setSessionAttr("role", RoomBuilder.entry())
        render("/index.jsp")
    }

    def thread1(){
        synchronized (lock){
            lock.wait()
        }
        renderText("ok")
    }

    def thread2(){
        synchronized (lock){
            lock.notifyAll()
        }
        renderText("ok")
    }
}
