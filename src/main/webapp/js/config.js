wq = {
    url:'/ht',
    ajax:["abouts","sy","news","research","keyan"],
    kypho:["./pho/keyan/ky1.png","./pho/keyan/ky2.png","./pho/keyan/ky3.png"],
    ph_url:["lb","ky"],
    loginurl:"http://www.sxagriiot.cn/ht/login.html"
    // loginurl:"http://localhost:8080/ht/login.html"
};
$.ajax({
    url: wq.url+"/get",
    method:"GET",
    success:function (res) {
        if ( "relogin"===res){
            alert("您的账号的其他地点登陆,即将前往登陆页面");
            window.location.href = wq.loginurl;
        }
        if ("fail"===res){
            window.location.href = wq.loginurl;
        }
        if ("logined"===res.login){
            $(".uname").html(res.name);
        }
    }
});

(function ($) {
    $.fn.extend({
        insertAtCaret: function (myValue) {
            var $t = $(this)[0];
            if (document.selection) {
                this.focus();
                sel = document.selection.createRange();
                sel.text = myValue;
                this.focus();
            } else if ($t.selectionStart || $t.selectionStart == '0') {
                var startPos = $t.selectionStart;
                var endPos = $t.selectionEnd;
                var scrollTop = $t.scrollTop;
                $t.value = $t.value.substring(0, startPos) + myValue + $t.value.substring(endPos, $t.value.length);
                this.focus();
                $t.selectionStart = startPos + myValue.length;
                $t.selectionEnd = startPos + myValue.length;
                $t.scrollTop = scrollTop;
            } else {
                this.value += myValue;
                this.focus();
            }
        }
    });
})(jQuery);
function up_pho() {
    if (document.getElementById("insert_pho").files[0]==null){
        alert("请先选择图片");
        return;
    }
    var formData = new FormData();
    formData.append('file', document.getElementById("insert_pho").files[0]);
    $.ajax({
        url: wq.url + "/upfile",
        method: 'POST',
        data: formData,
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
            console.log(res);
            $("#mes").insertAtCaret("\n[img]:|" + res + "|\n");
            $("insert_pho").attr("value","");
        }
    })
}
