/**
 * Created by Administrator on 2015/10/22 0022.
 */
angular.module('app.services').factory('UserService', function($http) {
    var current_user;
    return {
        getCurrentUser: function() {
            return current_user;
        },
        setCurrentUser: function(user) {
            current_user = user;
        }
    }
})