package org.herochooser.controller

import com.jfinal.core.Controller
import org.herochooser.model.Hero

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

    def create(){

    }
}
