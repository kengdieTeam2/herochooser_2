package org.herochooser.controller

import com.jfinal.core.Controller

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 13-8-23
 * Time: 下午8:31
 * To change this template use File | Settings | File Templates.
 */
class BootController extends Controller{
    def index(){
        render("/index.jsp")
    }
}
