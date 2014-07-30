function ScrollPic(t, i, s, e) {
    this.scrollContId = t,
    this.arrLeftId = i,
    this.arrRightId = s,
    this.dotListId = e,
    this.dotClassName = "dotItem",
    this.dotOnClassName = "dotItemOn",
    this.dotObjArr = [],
    this.pageWidth = 0,
    this.frameWidth = 0,
    this.speed = 10,
    this.space = 10,
    this.pageIndex = 0,
    this.autoPlay = !0,
    this.autoPlayTime = 5;
    var l, o, n = "ready";
    this.stripDiv = document.createElement("DIV"),
    this.listDiv01 = document.createElement("DIV"),
    this.listDiv02 = document.createElement("DIV"),
    ScrollPic.childs || (ScrollPic.childs = []),
    this.ID = ScrollPic.childs.length,
    ScrollPic.childs.push(this),
    this.initialize = function() {
        if (!this.scrollContId) throw new Error("必须指定scrollContId.");
        if (this.scrollContDiv = sina.$(this.scrollContId), !this.scrollContDiv) throw new Error('scrollContId不是正确的对象.(scrollContId = "' + this.scrollContId + '")');
        if (this.scrollContDiv.style.width = this.frameWidth + "px", this.scrollContDiv.style.overflow = "hidden", this.listDiv01.innerHTML = this.listDiv02.innerHTML = this.scrollContDiv.innerHTML, this.scrollContDiv.innerHTML = "", this.scrollContDiv.appendChild(this.stripDiv), this.stripDiv.appendChild(this.listDiv01), this.stripDiv.appendChild(this.listDiv02), this.stripDiv.style.overflow = "hidden", this.stripDiv.style.zoom = "1", this.stripDiv.style.width = "32766px", this.listDiv01.style.cssFloat = "left", this.listDiv02.style.cssFloat = "left", sina.addEvent(this.scrollContDiv, "mouseover", Function("ScrollPic.childs[" + this.ID + "].stop()")), sina.addEvent(this.scrollContDiv, "mouseout", Function("ScrollPic.childs[" + this.ID + "].play()")), this.arrLeftId && (this.arrLeftObj = sina.$(this.arrLeftId), this.arrLeftObj && (sina.addEvent(this.arrLeftObj, "mousedown", Function("ScrollPic.childs[" + this.ID + "].rightMouseDown()")), sina.addEvent(this.arrLeftObj, "mouseup", Function("ScrollPic.childs[" + this.ID + "].rightEnd()")), sina.addEvent(this.arrLeftObj, "mouseout", Function("ScrollPic.childs[" + this.ID + "].rightEnd()")))), this.arrRightId && (this.arrRightObj = sina.$(this.arrRightId), this.arrRightObj && (sina.addEvent(this.arrRightObj, "mousedown", Function("ScrollPic.childs[" + this.ID + "].leftMouseDown()")), sina.addEvent(this.arrRightObj, "mouseup", Function("ScrollPic.childs[" + this.ID + "].leftEnd()")), sina.addEvent(this.arrRightObj, "mouseout", Function("ScrollPic.childs[" + this.ID + "].leftEnd()")))), this.dotListId && (this.dotListObj = sina.$(this.dotListId), this.dotListObj)) {
            var t, i, s = Math.round(this.listDiv01.offsetWidth / this.frameWidth + .4);
            for (t = 0; s > t; t++) i = document.createElement("span"),
            this.dotListObj.appendChild(i),
            this.dotObjArr.push(i),
            i.className = t == this.pageIndex ? this.dotClassName: this.dotOnClassName,
            i.title = "第" + (t + 1) + "页",
            sina.addEvent(i, "click", Function("ScrollPic.childs[" + this.ID + "].pageTo(" + t + ")"))
        }
        this.autoPlay && this.play()
    },
    this.leftMouseDown = function() {
        "ready" == n && (n = "floating", o = setInterval("ScrollPic.childs[" + this.ID + "].moveLeft()", this.speed))
    },
    this.rightMouseDown = function() {
        "ready" == n && (n = "floating", o = setInterval("ScrollPic.childs[" + this.ID + "].moveRight()", this.speed))
    },
    this.moveLeft = function() {
        this.scrollContDiv.scrollLeft + this.space >= this.listDiv01.scrollWidth ? this.scrollContDiv.scrollLeft = this.scrollContDiv.scrollLeft + this.space - this.listDiv01.scrollWidth: this.scrollContDiv.scrollLeft += this.space,
        this.accountPageIndex()
    },
    this.moveRight = function() {
        this.scrollContDiv.scrollLeft - this.space <= 0 ? this.scrollContDiv.scrollLeft = this.listDiv01.scrollWidth + this.scrollContDiv.scrollLeft - this.space: this.scrollContDiv.scrollLeft -= this.space,
        this.accountPageIndex()
    },
    this.leftEnd = function() {
        if ("floating" == n) {
            n = "stoping",
            clearInterval(o);
            var t = this.pageWidth - this.scrollContDiv.scrollLeft % this.pageWidth;
            this.move(t)
        }
    },
    this.rightEnd = function() {
        if ("floating" == n) {
            n = "stoping",
            clearInterval(o);
            var t = -this.scrollContDiv.scrollLeft % this.pageWidth;
            this.move(t)
        }
    },
    this.move = function(t, i) {
        var s = t / 5;
        i || (s > this.space && (s = this.space), s < -this.space && (s = -this.space)),
        s = Math.abs(s) < 1 && 0 != s ? s >= 0 ? 1 : -1 : Math.round(s);
        this.scrollContDiv.scrollLeft + s;
        return s > 0 ? this.scrollContDiv.scrollLeft + s >= this.listDiv01.scrollWidth ? this.scrollContDiv.scrollLeft = this.scrollContDiv.scrollLeft + s - this.listDiv01.scrollWidth: this.scrollContDiv.scrollLeft += s: this.scrollContDiv.scrollLeft - s <= 0 ? this.scrollContDiv.scrollLeft = this.listDiv01.scrollWidth + this.scrollContDiv.scrollLeft - s: this.scrollContDiv.scrollLeft += s,
        t -= s,
        0 == Math.abs(t) ? (n = "ready", this.autoPlay && this.play(), this.accountPageIndex(), void 0) : (this.accountPageIndex(), setTimeout("ScrollPic.childs[" + this.ID + "].move(" + t + "," + i + ")", this.speed), void 0)
    },
    this.next = function() {
        "ready" == n && (n = "stoping", this.move(this.pageWidth, !0))
    },
    this.play = function() {
        this.autoPlay && (clearInterval(l), l = setInterval("ScrollPic.childs[" + this.ID + "].next()", 1e3 * this.autoPlayTime))
    },
    this.stop = function() {
        clearInterval(l)
    },
    this.pageTo = function(t) {
        if ("ready" == n) {
            n = "stoping";
            var i = t * this.frameWidth - this.scrollContDiv.scrollLeft;
            this.move(i, !0)
        }
    },
    this.accountPageIndex = function() {
        this.pageIndex = Math.round(this.scrollContDiv.scrollLeft / this.frameWidth),
        this.pageIndex > Math.round(this.listDiv01.offsetWidth / this.frameWidth + .4) - 1 && (this.pageIndex = 0);
        var t;
        for (t = 0; t < this.dotObjArr.length; t++) this.dotObjArr[t].className = t == this.pageIndex ? this.dotClassName: this.dotOnClassName
    }
}
var sina = {
    $: function(objName) {
        return document.getElementById ? eval('document.getElementById("' + objName + '")') : eval("document.all." + objName)
    },
    isIE: -1 != navigator.appVersion.indexOf("MSIE") ? !0 : !1,
    addEvent: function(t, i, s) {
        t.attachEvent ? t.attachEvent("on" + i, s) : t.addEventListener(i, s, !1)
    },
    delEvent: function(t, i, s) {
        t.detachEvent ? t.detachEvent("on" + i, s) : t.removeEventListener(i, s, !1)
    },
    readCookie: function(t) {
        var i = "",
        s = t + "=";
        if (document.cookie.length > 0) {
            var e = document.cookie.indexOf(s);
            if ( - 1 != e) {
                e += s.length;
                var l = document.cookie.indexOf(";", e); - 1 == l && (l = document.cookie.length),
                i = unescape(document.cookie.substring(e, l))
            }
        }
        return i
    },
    writeCookie: function(t, i, s, e) {
        var l = "",
        o = "";
        null != s && (l = new Date((new Date).getTime() + 36e5 * s), l = "; expires=" + l.toGMTString()),
        null != e && (o = ";domain=" + e),
        document.cookie = t + "=" + escape(i) + l + o
    },
    readStyle: function(t, i) {
        if (t.style[i]) return t.style[i];
        if (t.currentStyle) return t.currentStyle[i];
        if (document.defaultView && document.defaultView.getComputedStyle) {
            var s = document.defaultView.getComputedStyle(t, null);
            return s.getPropertyValue(i)
        }
        return null
    }
};