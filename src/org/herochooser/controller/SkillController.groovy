package org.herochooser.controller

import com.jfinal.core.Controller
import org.herochooser.model.Hero
import org.herochooser.model.Skill

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午9:17
 * To change this template use File | Settings | File Templates.
 */
class SkillController extends Controller{

    def asJSON(){
        renderJson(Skill.dao.findById(getPara("id")))
    }

    def asJSONByHero(){
        renderJson(Skill.dao.byHero(Hero.dao.findById(getPara("id"))))
    }

}
