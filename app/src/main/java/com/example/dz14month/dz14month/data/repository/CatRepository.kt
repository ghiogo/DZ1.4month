package com.example.dz14month.dz14month.data.repository

import com.example.dz14month.dz14month.data.model.MainModel

class CatRepository {

    private var catModelList = mutableListOf<MainModel>()

    fun getListOfCatHTTP(): List<MainModel> {
        catModelList.clear()
        catModelList.add(MainModel("https://http.cat/403", "Forbidden"))
        catModelList.add(MainModel("https://http.cat/404", "Not Found"))
        catModelList.add(MainModel("https://http.cat/405", "Method Not Allowed"))
        catModelList.add(MainModel("https://http.cat/406", "Not Acceptable"))
        catModelList.add(MainModel("https://http.cat/407", "Proxy Authentication Required"))
        catModelList.add(MainModel("https://http.cat/408", "Request Timeout"))
        catModelList.add(MainModel("https://http.cat/409", "Conflict"))
        catModelList.add(MainModel("https://http.cat/410", "Gone"))
        catModelList.add(MainModel("https://http.cat/411", "Length Required"))
        catModelList.add(MainModel("https://http.cat/412", "Precondition Failed"))
        catModelList.add(MainModel("https://http.cat/413", "Payload Too Large"))
        catModelList.add(MainModel("https://http.cat/414", "Request-URI Too Long"))
        catModelList.add(MainModel("https://http.cat/415", "Unsupported Media Type"))
        catModelList.add(MainModel("https://http.cat/416", "Request Range Satisfiable"))
        catModelList.add(MainModel("https://http.cat/417", "Expectation Failed"))
        catModelList.add(MainModel("https://http.cat/418", "I'm a teapot"))
        catModelList.add(MainModel("https://http.cat/420", "Enhance Your Calm"))
        catModelList.add(MainModel("https://http.cat/421", "Misdirected Request"))
        catModelList.add(MainModel("https://http.cat/423", "Locked"))
        catModelList.add(MainModel("https://http.cat/424", "Failed Dependency"))
        catModelList.add(MainModel("https://http.cat/425", "Too Early"))
        catModelList.add(MainModel("https://http.cat/426", "Upgrade Requested"))
        catModelList.add(MainModel("https://http.cat/429", "Too Many Requested"))
        catModelList.add(MainModel("https://http.cat/431", "Request Header Fields Too Large"))
        catModelList.add(MainModel("https://http.cat/444", "No Response"))
        catModelList.add(MainModel("https://http.cat/450", "Blocked Windows Parental Controls"))
        catModelList.add(MainModel("https://http.cat/451", "Unavailable For Legal Reasons"))
        catModelList.add(MainModel("https://http.cat/497", "HTTP Request Sent HTTPS Port"))
        catModelList.add(MainModel("https://http.cat/498", "Token expired/invalid"))
        catModelList.add(MainModel("https://http.cat/499", "Client Closed Request"))
        catModelList.add(MainModel("https://http.cat/500", "Internal Server Error"))
        catModelList.add(MainModel("https://http.cat/501", "Not Implemented"))
        catModelList.add(MainModel("https://http.cat/502", "Bad Gateway"))
        catModelList.add(MainModel("https://http.cat/503", "Service Unavailable"))
        catModelList.add(MainModel("https://http.cat/504", "Gateway Timeout"))
        catModelList.add(MainModel("https://http.cat/506", "Variant Also Negotiates"))
        catModelList.add(MainModel("https://http.cat/508", "Loop Detected"))
        return catModelList
    }
}