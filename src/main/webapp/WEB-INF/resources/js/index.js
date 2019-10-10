$('#signInBtn').click(function() {
   var id = $('#userId').val();
   var pwd = $('#userPwd').val();

   alert(id+", "+pwd);

   $.get('/signin', {
       userId: id,
       userPwd: pwd
   }, function(result) {
       if(result == {"result":"true"}) {

       }
       else {

       }
        console.dir(result);
        console.log(result);
    });
});