!
function(i) {
    i.fn.mogFocus = function(e) {
        var t = i.extend({},
        i.fn.mogFocus.defaults, e);
        return this.each(function() {
            function e() {
                f.next("ul").find("[data-img]").each(function() {
                    var e = i(this).attr("data-img"),
                    t = i(this).attr("height"),
                    n = i(this).attr("width"),
                    a = e.substring(e.lastIndexOf(".") + 1, e.length),
                    s = parseInt(i(this).css("marginLeft"));
                    "png" == a && (i(this).wrap("<i></i>"), i(this).parent().css({
                        display: "inline-block",
                        filter: "progid:DXImageTransform.Microsoft.AlphaImageLoader(src=" + e + ")",
                        height: t,
                        width: n,
                        marginLeft: s
                    }), i(this).remove())
                })
            }
            function n(e, t) {
                e.children().each(function() {
                    i(this).children().wrap("<li></li>"),
                    t.push(i(this).html())
                }),
                e.html(t.reverse().join(""))
            }
            function a() {
                I.animate({
                    marginLeft: -v,
                    opacity: .8
                },
                t.prevNextAnima),
                W.animate({
                    marginRight: -v,
                    opacity: .8
                },
                t.prevNextAnima)
            }
            function s() {
                I.animate({
                    marginLeft: -(v + t.prevNextPos),
                    opacity: 0
                },
                t.prevNextAnima),
                W.animate({
                    marginRight: -(v + t.prevNextPos),
                    opacity: 0
                },
                t.prevNextAnima)
            }
            function l(i) {
                f.delay(t.focusDelay).animate(i, t.focusTime),
                t.single && f.next().delay(t.focusDelayTwo).animate(i, t.focusTwoTime)
            }
            function o(i, e) {
                var n = f.children(":visible"),
                a = f.next("ul").children(":visible");
                n.css("z-index", 10).delay(t.focusDelayTwo).animate(i, {
                    duration: t.randomsImgTime,
                    easing: t.randeasing,
                    complete: function() {
                        n.hide().css(e)
                    }
                }),
                a.css("z-index", 10).delay(t.focusDelay).animate(i, {
                    duration: t.randomsImgTime,
                    easing: t.randeasing,
                    complete: function() {
                        a.hide().css(e)
                    }
                })
            }
            function r(e) {
                w = "100%" == t.scrollWidth || "auto" == t.scrollWidth ? i(window).width() : t.scrollWidth;
                var n = {
                    fade: function() {
                        f.children().eq(e).delay(t.focusDelay).fadeIn(t.fadeTime).siblings().fadeOut(t.fadeTime),
                        t.single && f.next().children().eq(e).delay(t.focusDelayTwo).fadeIn(t.fadeTwoTime).siblings().fadeOut(t.fadeTwoTime)
                    },
                    lrSliding: function() {
                        l({
                            left: -(w * e)
                        })
                    },
                    tbSliding: function() {
                        l({
                            bottom: -k * e
                        })
                    },
                    randomImg: function() {
                        var i = Math.floor(Math.random() * T.length),
                        n = f.children().height(),
                        a = f.children().width(),
                        s = [function() {
                            o({
                                top: -n
                            },
                            {
                                top: 0
                            })
                        },
                        function() {
                            o({
                                left: a
                            },
                            {
                                left: 0
                            })
                        },
                        function() {
                            o({
                                top: n
                            },
                            {
                                top: 0
                            })
                        },
                        function() {
                            o({
                                left: -a
                            },
                            {
                                left: 0
                            })
                        },
                        function() {
                            o({
                                top: -n,
                                opacity: 0
                            },
                            {
                                top: 0,
                                opacity: 1
                            })
                        },
                        function() {
                            o({
                                left: a,
                                opacity: 0
                            },
                            {
                                left: 0,
                                opacity: 1
                            })
                        },
                        function() {
                            o({
                                top: n,
                                opacity: 0
                            },
                            {
                                top: 0,
                                opacity: 1
                            })
                        },
                        function() {
                            o({
                                left: -a,
                                opacity: 0
                            },
                            {
                                left: 0,
                                opacity: 1
                            })
                        }];
                        s[i](),
                        f.children().eq(e).css("z-index", 1).show(),
                        f.next("ul").children().eq(e).css("z-index", 1).delay(t.focusDelay).fadeIn(600)
                    }
                };
                switch (n[t.animationWay](), "thumbnail" == t.btnStyle && S.children().length > t.thumlen && c(), t.btnStyle) {
                case "thumbnail":
                    S.children().eq(e).css(t.thumSelected).siblings().css(t.thumSubsty);
                    break;
                case "noNumber":
                    S.children().eq(e).addClass("hover").siblings().removeClass("hover");
                    break;
                case "number":
                    S.children().eq(e).css(t.thumSelected).siblings().css(t.thumSubsty)
                }
            }
            function c() {
                S.children().length > t.thumlen && (y - H == t.thumlen - 1 ? (u("-="), H += B, z += 1) : 0 == y && (S.animate({
                    left: 0
                },
                800), H = 0))
            }
            function h() {
                S.hide(),
                m.css({
                    top: Math.round(p / 2),
                    height: 0,
                    display: "block"
                }).delay(700).animate({
                    top: 0,
                    height: p
                },
                {
                    duration: 1e3,
                    easing: "easeInOutQuart",
                    complete: function() {
                        S.fadeIn(600),
                        "show" == t.prevNextToggle && a()
                    }
                })
            }
            function d() {
                m.css("display", "block"),
                "show" == t.prevNextToggle && (I.css({
                    marginLeft: -v,
                    opacity: .8
                }), W.css({
                    marginRight: -v,
                    opacity: .8
                }))
            }
            function u(i) {
                S.animate({
                    left: i + M * B
                },
                800,
                function() {
                    z == C - 1 ? R.css("visibility", "hidden") : R.css("visibility", "visible"),
                    0 == z ? P.css("visibility", "hidden") : P.css("visibility", "visible")
                })
            }
            var m = i(this),
            f = m.children().children().first(),
            g = f.children().length,
            p = m.height(),
            b = f.find("img").attr("width"),
            v = Math.round(b / 2),
            y = 0,
            w = null,
            x = [],
            T = ["top", "right", "bottom", "left", "fadeTop", "fadeRight", "fadeBottom", "fadeLeft"]; ! t.single && !!f.next("ul") && f.next("ul").remove(),
            t.conversionImg && (("fade" == t.animationWay || "randomImg" == t.animationWay) && i.browser.msie && parseInt(i.browser.version) <= 8 && e(), i.browser.msie && 6 == parseInt(i.browser.version) && e()),
            "100%" == t.scrollWidth || "auto" == t.scrollWidth ? i(window).bind("resize load",
            function() {
                var e = i(window).width();
                f.parent().children().children().css("width", e);
                var n = f.children().width();
                "lrSliding" == t.animationWay ? f.parent().children("ul").css({
                    width: n * g,
                    left: -(n * y)
                }) : f.parent().children("ul").css("width", e)
            }) : (f.parent().children().children().css("width", t.scrollWidth), f.parent().children().css("width", t.scrollWidth * g)),
            ("fade" == t.animationWay || "randomImg" == t.animationWay) && (f.parent().children("ul").children().css({
                position: "absolute"
            }), f.children().filter(":not(':first')").hide().parent().next("ul").children().filter(":not(':first')").hide()),
            m.css("width", t.scrollWidth).children().css("width", t.scrollWidth),
            x.push("<ul class='imgBtn'>"),
            f.children("li").each(function(i) {
                switch (t.btnStyle) {
                case "number":
                    x.push("<li>" + (i + 1) + "</li>");
                    break;
                case "noNumber":
                    x.push("<li></li>");
                    break;
                case "thumbnail":
                    var e = f.children().children().eq(i).find("[data-img]").attr("data-img");
                    x.push("<li><img width=" + t.thumWidth + " height=" + t.thumHeight + " src=" + e + " /></li>")
                }
            }),
            x.push("</ul>"),
            "hidden" != t.btnStyle && m.append(x.join("")),
            "hide" != t.prevNextToggle && f.parent().prepend("<a href='#' class='prev'></a>").append("<a href='#' class='next'></a>");
            var S = m.children(".imgBtn"),
            I = m.find(".prev"),
            W = m.find(".next");
            if (I.css({
                marginLeft: -(v + t.prevNextPos),
                opacity: 0
            }), W.css({
                marginRight: -(v + t.prevNextPos),
                opacity: 0
            }), "100%" == t.scrollWidth || "auto" == t.scrollWidth ? S.css(t.thumCSS) : S.css("right", 0), "tbSliding" == t.animationWay) {
                var N = f.next("ul"),
                k = f.children().first().height(),
                q = parseInt(N.css("top")),
                A = [],
                D = [];
                n(f, A),
                n(N, D),
                N.children().css({
                    height: k - q,
                    paddingTop: q
                }).parent().css({
                    top: "auto",
                    bottom: 0
                }),
                f.css("bottom", 0)
            }
            if ("thumbnail" == t.btnStyle && (S.children().css(t.thumSubsty).css({
                width: t.thumWidth,
                height: t.thumHeight
            }), S.children().length > t.thumlen)) {
                S.removeAttr("class").wrap("<div class='imgBtn'></div>").parent().css(t.thumCSS),
                S.before("<a href='#' class='thumPrev'></a>").after("<a href='#' class='thumNext'></a>");
                var L = S.children(),
                O = parseInt(L.css("marginRight")),
                M = L.outerWidth() + O,
                P = i(".thumPrev"),
                R = i(".thumNext"),
                B = Math.ceil(t.thumlen / 2),
                C = Math.ceil(L.length / B),
                z = 0,
                H = 0;
                S.parent().css("width", M * t.thumlen + 2 * (P.width() + parseInt(P.css("marginRight")))),
                S.wrap("<div class='btnWarp'></div>"),
                m.find(".btnWarp").css({
                    "float": "left",
                    position: "relative",
                    width: M * t.thumlen,
                    height: L.outerHeight()
                }),
                S.css({
                    margin: 0,
                    right: 0,
                    position: "absolute",
                    left: 0,
                    width: M * L.length,
                    height: L.outerHeight()
                }),
                P.css("visibility", "hidden"),
                P.css("float", "left").click(function() {
                    return 0 != z && (u("+="), z -= 1, H -= B),
                    !1
                }),
                R.css("float", "right").click(function() {
                    return z != C - 1 && (u("-="), z += 1, H += B),
                    !1
                })
            }
            switch (t.btnStyle) {
            case "thumbnail":
                S.children().eq(0).css(t.thumSelected);
                break;
            case "noNumber":
                S.children().eq(0).addClass("hover");
                break;
            case "number":
                S.children().eq(0).css(t.thumSelected).siblings().css(t.thumSubsty)
            }
            S.children("li").each(function() {
                i(this).click(function() {
                    if (!f.is(":animated") && !f.next("ul").is(":animated") && !f.children().is(":animated")) {
                        var e = i(this).index();
                        y != e && r(e),
                        y = e,
                        "thumbnail" == t.btnStyle && (e - H == t.thumlen - 1 && (u("-="), H += B, z += 1), e - H == 0 && 0 != e && (u("+="), H -= B, z -= 1))
                    }
                })
            });
            var Q;
            if (m.hover(function() {
                t.autoScroll && clearInterval(Q),
                "toggle" == t.prevNextToggle && a()
            },
            function() {
                t.autoScroll && (Q = setInterval(function() {
                    y += 1,
                    y == g && (y = 0),
                    r(y)
                },
                t.time)),
                "toggle" == t.prevNextToggle && s()
            }).trigger("mouseleave"), m.find(".prev").click(function() {
                return ! f.is(":animated") && !f.next("ul").is(":animated") && !f.children().is(":animated") && (y -= 1, -1 == y && (y = g - 1), r(y)),
                !1
            }).hover(function() {
                i(this).fadeTo(300, .6)
            },
            function() {
                i(this).fadeTo(300, .8)
            }), m.find(".next").click(function() {
                return ! f.is(":animated") && !f.next("ul").is(":animated") && !f.children().is(":animated") && (y += 1, y == g && (y = 0), r(y)),
                !1
            }).hover(function() {
                i(this).fadeTo(300, .6)
            },
            function() {
                i(this).fadeTo(300, .8)
            }), t.loadswitch) {
                var j = m.find("img");
                m.children().hide(),
                m.parent().css("background", "url(" + t.loading + ") no-repeat center center"),
                S.hide(),
                j.load(function() {
                    m.parent().css("background", "none"),
                    t.loadAnimation && h(),
                    m.children("div").show()
                }),
                t.loadAnimation || (S.show(), d())
            } else t.loadAnimation ? h() : d()
        })
    },
    i.fn.mogFocus.defaults = {
        loadAnimation: !0,
        loadswitch: !1,
        loading: "images/loading.gif",
        time: 3e3,
        scrollWidth: "100%",
        autoScroll: !0,
        conversionImg: !0,
        animationWay: "lrSliding",
        prevNextPos: 70,
        prevNextAnima: {
            duration: 600,
            easing: "easeInOutBack"
        },
        prevNextToggle: "show",
        btnStyle: "thumbnail",
        thumWidth: 90,
        thumHeight: 36,
        thumlen: 5,
        thumCSS: {
            right: "50%",
            "margin-right": -156
        },
        thumSubsty: {
            border: "1px solid #ccc",
            padding: 1,
            background: "#fff"
        },
        thumSelected: {
            border: "1px solid #6d6d6d",
            background: "#fff"
        },
        single: !0,
        focusDelay: 0,
        focusDelayTwo: 200,
        focusTime: {
            duration: 1300,
            easing: "easeInOutQuart"
        },
        focusTwoTime: {
            duration: 1300,
            easing: "easeInOutQuart"
        },
        fadeTime: 400,
        fadeTwoTime: 600,
        randomsImgTime: 600,
        randeasing: "easeInOutBack"
    }
} (jQuery);