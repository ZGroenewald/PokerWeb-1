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

import Services.AuthenticationService;
import Services.IPokerService;
import Services.PokerService;
import Users.Game;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import controllers.AuthenticationController;

import javax.persistence.EntityManager;
import java.security.Provider;

@Singleton
public class Module extends AbstractModule {

    protected void configure() {
        
        // bind your injections here!
        bind(IPokerService.class).to(PokerService.class);
        bind(AuthenticationController.class);
        bind(Game.class);
    }

}
