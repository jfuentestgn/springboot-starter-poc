yieldUnescaped '<!DOCTYPE html>'
html(lang:'en') {
    head {
        meta('http-equiv':'"Content-Type" content="text/html; charset=utf-8"')
        title('Spring Boot Starter - Example')
    }
    body {
        p("User name: ${user.name}")
        p('Company name: ' + user.company.name)
    }
}