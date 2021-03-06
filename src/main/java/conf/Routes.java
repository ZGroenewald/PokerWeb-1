/**
 * Copyright (C) 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package conf;


import ninja.AssetsController;
import ninja.Router;
import ninja.application.ApplicationRoutes;
import controllers.ApplicationController;

public class Routes implements ApplicationRoutes {

    @Override
    public void init(Router router) {  
        
        router.GET().route("/index").with(ApplicationController.class, "index");
        router.POST().route("/index").with(ApplicationController.class, "index");
        router.POST().route("/logon").with(ApplicationController.class, "logon");
        router.GET().route("/logon").with(ApplicationController.class, "logon");
        router.GET().route("/hello_world.json").with(ApplicationController.class, "helloWorldJson");
        router.POST().route("/register").with(ApplicationController.class, "register");
        router.GET().route("/register").with(ApplicationController.class, "register");
        router.GET().route("/logout").with(ApplicationController.class, "logout");
        router.GET().route("/restore").with(ApplicationController.class, "restore");
        router.POST().route("/setplayers").with(ApplicationController.class, "setplayers");
        router.GET().route("/setplayers").with(ApplicationController.class, "setplayers");
        router.GET().route("/history").with(ApplicationController.class, "getGameHistory");
        router.GET().route("/getLoggedInPlayerName").with(ApplicationController.class, "getLoggedInPlayerName");
        router.POST().route("/setGameName").with(ApplicationController.class, "setGameName");
        router.POST().route("/createGame").with(ApplicationController.class, "createGame");
        router.POST().route("/checkPlayer").with(ApplicationController.class, "checkPlayer");
        router.POST().route("/createLobby").with(ApplicationController.class, "createLobby");
        router.GET().route("/createLobby").with(ApplicationController.class, "createLobby");
        router.GET().route("/getLobbyGames").with(ApplicationController.class, "getLobbyGames");
        router.GET().route("/hostGame").with(ApplicationController.class , "hostGame");
        //router.GET().route("/joinGame").with(ApplicationController.class , "joinGame");
        
 
        ///////////////////////////////////////////////////////////////////////
        // Assets (pictures / javascript)
        ///////////////////////////////////////////////////////////////////////    
        router.GET().route("/assets/webjars/{fileName: .*}").with(AssetsController.class, "serveWebJars");
        router.GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");
        
        ///////////////////////////////////////////////////////////////////////
        // Index / Catchall shows index page
        ///////////////////////////////////////////////////////////////////////
        router.GET().route("/").with(ApplicationController.class, "logon");
        router.POST().route("/").with(ApplicationController.class, "logon");
    }

}
