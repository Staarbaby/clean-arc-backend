package com.capmus.clean.arc.api.commons.controller;

import ru.foodtechlab.lib.auth.integration.core.authorizartion.AuthorizationServiceFacade;
import ru.foodtechlab.lib.auth.integration.proxy.api.authorization.v1.controllers.AuthorizationProxyApiController;

public class AuthorizationProxyController extends AuthorizationProxyApiController {
    public AuthorizationProxyController(AuthorizationServiceFacade authorizationServiceFacade) {
        super(authorizationServiceFacade);
    }
}
