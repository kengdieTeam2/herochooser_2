package org.herochooser.model

import com.jfinal.plugin.activerecord.Model

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午8:32
 * To change this template use File | Settings | File Templates.
 */
class Skill extends Model<Skill>{
    public static Skill dao = new Skill()

    def byHero(Hero hero){
        dao.find("SELECT * FROM skill WHERE hero=?", hero.getInt("id"))
    }
}
