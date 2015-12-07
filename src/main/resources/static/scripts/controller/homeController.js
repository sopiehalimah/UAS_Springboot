angular.module('aplikasiSpringboot')
        .controller('homeController', function ($scope, homeService){
          $scope.hallo = 'Books'  ;
          $scope.judul = 'Books';
          $scope.model = {};
          $scope.isEdit = false;
          
          
          $scope.hapus = function (index){
              $scope.data.splice(index,1);
              homeService.delete(data).success(function (data){
                  alert("data berhasil dihapus");
              });
          };
          
          
          $scope.clear = function(){
              $scope.model = {};
              $scope.isEdit = false;
          };
          
          $scope.edit = function(data, index){
              $scope.model.judul = data.judul;
              $scope.model.genre = data.genre;
              $scope.model.jenis = data.jenis;
              $scope.indexEdit = index;
              $scope.isEdit = true;
          };
          
           $scope.tampilkanData = function(){
              homeService.getBukuFromDb().success(function (data){
                  $scope.data = data.content;
              });
          };
          
          $scope.simpanData = function (data){
              homeService.save(data).success(function (data){
                  alert("data berhasil disimpan");
              });
              
          };
          
          $scope.isDataEdit = false;
          $scope.model = {};
          $scope.simpan = function (data){
                if ($scope.isDataEdit == true){
                  homeService.update(data.id, data).success(function (data){
                  alert("data berhasil dirubah");
                  $scope.clearData();
                }).error(function (){
                    alert("terjadi kesalahan dalam penyimpanan data");
                }) ; 
                }else{
                    homeService.save(data).success(function (data){
                    alert("data berhasil disimpan");
                    $scope.clearData();
                    }).error(function (){
                    alert("terjadi kesalahan dalam penyimpanan data");
                })  ;
                }
              
              
          };
          
          $scope.hapusData = function (id){
             homeService.delete(id).success(function (data){
                    alert("data berhasil dihapus");
                     $scope.clearData();
             }).error(function (){
                    alert("terjadi kesalahan dalam penghapusan data");
                     $scope.clearData();
             });
          };
          $scope.editData = function (data){
              $scope.isDataEdit = true;
              $scope.model = {};
              $scope.model.judul = data.judul;
              $scope.model.genre = data.genre;
              $scope.model.jenis = data.jenis;
              $scope.model.id = data.id;
              
              
          };
          $scope.clearData = function (){
              $scope.isDataEdit = false;
              $scope.model = {};
              $scope.reloadData();
          };
          $scope.reloadData = function () {
            homeService.getBukuFromDb().success(function (data){
                  $scope.data = data.content;
              });  
          };
});
