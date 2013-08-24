package org.herochooser.controller

import com.jfinal.core.Controller
import org.herochooser.model.Hero
import org.herochooser.room.Role
import org.herochooser.room.RoomObject

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
class HeroController extends Controller {

    def asJSON() {
        renderJson(Hero.dao.findById(getPara("id")))
    }

    def confirm(){
        Role role = getSessionAttr("role")
        Hero hero = Hero.dao.findById(getParaToInt("id"))
        role.hero = hero
        renderJson(hero)
        RoomObject room = getSessionAttr("room")
        room.notifyAll()
    }

    def create(){

    }

    def query(){

    }

    def random(){
        Role role = getSessionAttr("role")
        RoomObject room = getSessionAttr("room")
        if(role.roomIndex != room.index){
            room.wait()
        }

        renderJson([])

    }

    def randomKing(){

    }
}
