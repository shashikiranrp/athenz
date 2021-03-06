//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.yahoo.rdl.*;

//
// OAuth2Token -
//
public class OAuth2Token {
    public int ver;
    public String aud;
    public long exp;
    public long iat;
    public String iss;
    public String sub;

    public OAuth2Token setVer(int ver) {
        this.ver = ver;
        return this;
    }
    public int getVer() {
        return ver;
    }
    public OAuth2Token setAud(String aud) {
        this.aud = aud;
        return this;
    }
    public String getAud() {
        return aud;
    }
    public OAuth2Token setExp(long exp) {
        this.exp = exp;
        return this;
    }
    public long getExp() {
        return exp;
    }
    public OAuth2Token setIat(long iat) {
        this.iat = iat;
        return this;
    }
    public long getIat() {
        return iat;
    }
    public OAuth2Token setIss(String iss) {
        this.iss = iss;
        return this;
    }
    public String getIss() {
        return iss;
    }
    public OAuth2Token setSub(String sub) {
        this.sub = sub;
        return this;
    }
    public String getSub() {
        return sub;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != OAuth2Token.class) {
                return false;
            }
            OAuth2Token a = (OAuth2Token) another;
            if (ver != a.ver) {
                return false;
            }
            if (aud == null ? a.aud != null : !aud.equals(a.aud)) {
                return false;
            }
            if (exp != a.exp) {
                return false;
            }
            if (iat != a.iat) {
                return false;
            }
            if (iss == null ? a.iss != null : !iss.equals(a.iss)) {
                return false;
            }
            if (sub == null ? a.sub != null : !sub.equals(a.sub)) {
                return false;
            }
        }
        return true;
    }
}
