$("#slider").mogFocus({
    loadAnimation: !1,
    loadswitch: !0,
    loading: "/wp-content/themes/yssyqb/img/loading.gif",
    thumWidth: 132,
    thumHeight: 36,
    thumlen: 5,
    thumCSS: {
        right: "50%",
        "margin-right": -226
    },
    thumSubsty: {
        border: "1px solid #D0B799",
        padding: 0,
        background: "none"
    },
    thumSelected: {
        border: "1px solid #8E7453",
        background: "none"
    }
}),
$(function() {
    if (0 != $("#scrollPic").length) {
        var i = new ScrollPic;
        i.scrollContId = "scrollPic",
        i.arrLeftId = "listScrollPre",
        i.arrRightId = "listScrollNext",
        i.frameWidth = 860,
        i.pageWidth = 216,
        i.speed = 10,
        i.space = 10,
        i.autoPlay = !1,
        i.autoPlayTime = 3,
        i.initialize()
    }
});