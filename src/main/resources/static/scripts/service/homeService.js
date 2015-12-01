angular.module('aplikasiSpringboot')
        .factory('homeService', function ($http){
            return {
                    getBuku: function (){
                            return $http.get("/buku");
                        },
                    getListBuku: function (){
                            return $http.get("/listBuku");
                    },
                    getBukuFromDb:function (){
                        return $http.get("/api/buku");
                    },
                    save: function (data){
                        return $http.post("/api/buku",data);
                    },
                    delete:function(id){
                        return $http.delete("/api/buku/"+id);
                    },
                    update:function(id,data){
                        return $http.put("/api/buku/"+id,data);
                    },
                    getLoggedIn:function(){
                        return $http.get("/api/user/loggedin");
                    }
            };
});


