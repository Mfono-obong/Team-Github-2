{
  "id": "df71d81f-1a66-4cf9-b556-2ee2c1b5d994",
  "version": "2.0",
  "name": "Facebook Project",
  "url": "https://www.facebook.com/",
  "tests": [{
    "id": "89dccedd-7211-4150-a0dd-71c55bbb1d38",
    "name": "Invalid password",
    "commands": []
  }, {
    "id": "1eeb7aed-7b71-4107-bd1b-433e1d9eb7dc",
    "name": "Invalid Username",
    "commands": [{
      "id": "5bd8933e-4092-41ea-907b-b5e75a165450",
      "comment": "",
      "command": "open",
      "target": "https://web.facebook.com/?_rdc=1&_rdr",
      "targets": [],
      "value": ""
    }, {
      "id": "e620661a-0137-4fb7-ab9f-2fe3c370aa7d",
      "comment": "",
      "command": "setWindowSize",
      "target": "550x672",
      "targets": [],
      "value": ""
    }, {
      "id": "eafcb467-b7d8-4422-952f-44e5302677ca",
      "comment": "",
      "command": "click",
      "target": "id=email",
      "targets": [
        ["id=email", "id"],
        ["name=email", "name"],
        ["css=#email", "css:finder"],
        ["xpath=//input[@id='email']", "xpath:attributes"],
        ["xpath=//form[@id='u_0_2_nS']/div/div/input", "xpath:idRelative"],
        ["xpath=//div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "40eef8cb-3fa0-4bdc-a164-c335f6751b24",
      "comment": "",
      "command": "type",
      "target": "id=email",
      "targets": [
        ["id=email", "id"],
        ["name=email", "name"],
        ["css=#email", "css:finder"],
        ["xpath=//input[@id='email']", "xpath:attributes"],
        ["xpath=//form[@id='u_0_2_nS']/div/div/input", "xpath:idRelative"],
        ["xpath=//div/input", "xpath:position"]
      ],
      "value": "garec4tru.com"
    }, {
      "id": "19fca59a-fbd9-413a-b57f-29407030caea",
      "comment": "",
      "command": "click",
      "target": "id=passContainer",
      "targets": [
        ["id=passContainer", "id"],
        ["css=#passContainer", "css:finder"],
        ["xpath=//div[@id='passContainer']", "xpath:attributes"],
        ["xpath=//form[@id='u_0_2_nS']/div/div[2]/div", "xpath:idRelative"],
        ["xpath=//form/div/div[2]/div", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "85c7e9e3-c9c4-483a-a1e4-088cd0088f32",
      "comment": "",
      "command": "click",
      "target": "id=pass",
      "targets": [
        ["id=pass", "id"],
        ["name=pass", "name"],
        ["css=#pass", "css:finder"],
        ["xpath=//input[@id='pass']", "xpath:attributes"],
        ["xpath=//div[@id='passContainer']/input", "xpath:idRelative"],
        ["xpath=//div[2]/div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "4e2e9732-676d-470f-b9f7-472dc6add986",
      "comment": "",
      "command": "type",
      "target": "id=pass",
      "targets": [
        ["id=pass", "id"],
        ["name=pass", "name"],
        ["css=#pass", "css:finder"],
        ["xpath=//input[@id='pass']", "xpath:attributes"],
        ["xpath=//div[@id='passContainer']/input", "xpath:idRelative"],
        ["xpath=//div[2]/div/input", "xpath:position"]
      ],
      "value": "Martins000"
    }, {
      "id": "7b7c8396-14d6-41a2-837a-50e306332649",
      "comment": "",
      "command": "click",
      "target": "id=u_0_5_zN",
      "targets": [
        ["id=u_0_5_zN", "id"],
        ["name=login", "name"],
        ["css=#u_0_5_zN", "css:finder"],
        ["xpath=//button[@id='u_0_5_zN']", "xpath:attributes"],
        ["xpath=//form[@id='u_0_2_nS']/div[2]/button", "xpath:idRelative"],
        ["xpath=//button", "xpath:position"],
        ["xpath=//button[contains(.,'Log in')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "0b9b7986-7805-4272-a40e-50592104fc51",
      "comment": "",
      "command": "click",
      "target": "id=email",
      "targets": [
        ["id=email", "id"],
        ["name=email", "name"],
        ["css=#email", "css:finder"],
        ["xpath=//input[@id='email']", "xpath:attributes"],
        ["xpath=//div[@id='email_container']/input", "xpath:idRelative"],
        ["xpath=//div[2]/div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "b8d2224b-f0c6-4932-b36b-739efc91a1c9",
      "comment": "",
      "command": "type",
      "target": "id=email",
      "targets": [
        ["id=email", "id"],
        ["name=email", "name"],
        ["css=#email", "css:finder"],
        ["xpath=//input[@id='email']", "xpath:attributes"],
        ["xpath=//div[@id='email_container']/input", "xpath:idRelative"],
        ["xpath=//div[2]/div/input", "xpath:position"]
      ],
      "value": "AKINTUNDE@GMAIL.COM"
    }, {
      "id": "a36177f4-436f-4ef2-8003-9546a49ad586",
      "comment": "",
      "command": "click",
      "target": "id=pass",
      "targets": [
        ["id=pass", "id"],
        ["name=pass", "name"],
        ["css=#pass", "css:finder"],
        ["xpath=//input[@id='pass']", "xpath:attributes"],
        ["xpath=//div[@id='loginform']/div[2]/div/div/input", "xpath:idRelative"],
        ["xpath=//div[2]/div/div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "4b4bf235-612c-4c08-a929-0a599a60b5db",
      "comment": "",
      "command": "type",
      "target": "id=pass",
      "targets": [
        ["id=pass", "id"],
        ["name=pass", "name"],
        ["css=#pass", "css:finder"],
        ["xpath=//input[@id='pass']", "xpath:attributes"],
        ["xpath=//div[@id='loginform']/div[2]/div/div/input", "xpath:idRelative"],
        ["xpath=//div[2]/div/div/input", "xpath:position"]
      ],
      "value": "MaRINSSSSSS"
    }, {
      "id": "8cf9ec0c-c26c-44c3-9e5b-401c7d39c319",
      "comment": "",
      "command": "click",
      "target": "id=loginbutton",
      "targets": [
        ["id=loginbutton", "id"],
        ["name=login", "name"],
        ["css=#loginbutton", "css:finder"],
        ["xpath=//button[@id='loginbutton']", "xpath:attributes"],
        ["xpath=//div[@id='loginform']/div[3]/button", "xpath:idRelative"],
        ["xpath=//button", "xpath:position"],
        ["xpath=//button[contains(.,'Log in')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "48691010-4547-4b10-85c6-4a655cc0a6d7",
      "comment": "",
      "command": "close",
      "target": "",
      "targets": [],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "a9ec42a9-366c-4df5-8332-5d5e019753da",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["89dccedd-7211-4150-a0dd-71c55bbb1d38"]
  }, {
    "id": "d3edff13-a11b-44d1-b9f8-0a238ae683bf",
    "name": "Facebook",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": []
  }],
  "urls": ["https://www.facebook.com/"],
  "plugins": []
}