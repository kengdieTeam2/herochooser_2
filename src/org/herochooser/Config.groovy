package org.herochooser

import com.jfinal.config.*
import com.jfinal.plugin.activerecord.ActiveRecordPlugin
import com.jfinal.plugin.druid.DruidPlugin
import com.jfinal.render.ViewType
import org.herochooser.controller.*
import org.herochooser.model.*

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午8:31
 * To change this template use File | Settings | File Templates.
 */
class Config extends JFinalConfig{
    @Override
    void configConstant(Constants me) {
        me.viewType = ViewType.JSP
        me.devMode = true
    }

    @Override
    void configRoute(Routes me) {
        me.add("/", BootController.class)
        me.add("/hero", HeroController.class)
        me.add("/skill", SkillController.class)
    }

    @Override
    void configPlugin(Plugins me) {
        DruidPlugin dp = new DruidPlugin("jdbc:mysql:///herochooser","root" ,"root")
        me.add(dp)
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp)
        me.add(arp)

        arp.addMapping("hero", Hero.class)
        arp.addMapping("skill", Skill.class)

    }

    @Override
    void configInterceptor(Interceptors me) {
    }

    @Override
    void configHandler(Handlers me) {
    }
}
