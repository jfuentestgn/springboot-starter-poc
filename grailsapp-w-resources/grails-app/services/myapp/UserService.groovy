package myapp

import grails.gorm.transactions.Transactional
import org.example.jsonplaceholderclient.JsonPlaceHolderClient
import org.example.jsonplaceholderclient.User

@Transactional
class UserService {

    JsonPlaceHolderClient jsonPlaceHolderClient

    User getUser(int userid) {
        return jsonPlaceHolderClient.getUser(userid)
    }
}
