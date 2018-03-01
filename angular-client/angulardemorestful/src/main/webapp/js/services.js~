'use strict';

/* Services */

var services = angular.module('ngdemo.services', ['ngResource']);

services.factory('UserFactory', function ($resource) {
    return $resource('/ngdemo/rest/users/wiki', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    })
});
