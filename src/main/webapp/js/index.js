function kayan(arrs,i){
    $("#"+wq.ajax[i]+" .mes").empty();
        arrs.forEach((arr, index) => {
             var p = "";
                arr.message.split('\n').forEach((value) => {
                    p += ' <p>' +value + '</p>';
            });
            $("#" + wq.ajax[i] + " .mes").append(
                '<div>' +
                ' <div class="col-md-4 ky"><form enctype="multipart/form-data"><input id="ky'+index+'"  name="file" type="file" onchange="up_pho('+index+',2,1)"></form><img src="'+wq.kypho[index]+'" alt=""></div>' +
                '<div class="col-md-6">' +
                p +
                '</div>' +
                '<div class="col-md-2"><button type="button" class="btn btn-danger" onclick="update('+arr.id+','+i+')">修改</button></div>' +
                '</div>'
            )
    })
}
function sy(arrs,i){
    $("#"+wq.ajax[i]+" .mes").empty();
    arrs.forEach((arr,index)=>{
        $("#"+wq.ajax[i]+" .mes").append(
            '<div>'+
            '  <p class="col-md-11">'+arr.message+'</p>'+
            ' <button type="button" class="btn btn-info col-md-1" onclick="update('+arr.id+','+i+')">修改</button>'+
            '  <br/>'+
            ' </div>'
        )
    })
}
function update(id,index) {
    $.ajax({
        url: wq.url+"/"+wq.ajax[index]+"/get/"+id,
        method: "GET",
        success:function (res) {
            $("#date input").val(res.extend.mes.date);
            $("#message").val(res.extend.mes.message).attr("iid",id).attr("ajax",index);
            $("#about-model").modal('toggle');
        }
    })
}
function send() {
    var index = $("#message").attr("ajax");
    var id = $("#message").attr("iid");
    $.ajax({
        url: wq.url+"/"+wq.ajax[index]+"/up/"+id,
        method:"PUT",
        data:{
            message: $("#message").val(),
            date:  $("#date input").val()
        },
        success:function (res) {
            console.log(res);
            getall();
            $("#about-model").modal('toggle');
        }
    })
}
function getall(){
    $.ajax({
        url:wq.url+"/all",
        method: 'GET',
        success: function(res){
            all = res.extend;
            console.log(all);
            sy(res.extend.sy,1);
            // kayan(res.extend.keyan,4)
        }
    });
}
function up_pho(i,i2,i3){
    var formData = new FormData();
    formData.append('file', document.getElementById(wq.ph_url[i3]+i).files[0]);
    $.ajax({
        url: wq.url+"/upfile"+i2+"/" + i,
        method: 'POST',
        data: formData,
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        success:function (res) {
            if ("success"===res){
                alert("上传成功")
            }
            history.go(0);
        }
    })
}
$(function () {
getall();
});