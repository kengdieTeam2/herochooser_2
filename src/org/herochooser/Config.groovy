package org.herochooser

import com.jfinal.config.Constants
import com.jfinal.config.Handlers
import com.jfinal.config.Interceptors
import com.jfinal.config.JFinalConfig
import com.jfinal.config.Plugins
import com.jfinal.config.Routes
import com.jfinal.render.ViewType
import org.herochooser.controller.BootController

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
    }

    @Override
    void configPlugin(Plugins me) {

    }

    @Override
    void configInterceptor(Interceptors me) {
    }

    @Override
    void configHandler(Handlers me) {
    }
}
