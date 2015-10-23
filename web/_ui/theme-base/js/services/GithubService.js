/**
 * Created by azheng on 10/23/2015.
 */
angular.module('app.services').factory('GithubService', function($http) {
    var githubUrl = "https://api.github.com";

    var runUserRequest = function (username, path) {
        // 从使用JSONP跨域调用Github API的$http服务中返回promise
        return $http({
            method: 'JSONP',
            url: githubUrl + '/users/' + username + '/' + path + '?callback=JSON_CALLBACK'
        });
    };
    return {
        events: function(username) {
            return runUserRequest(username, 'events');
        }
    }
})