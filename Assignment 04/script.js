document.getElementById("myForm").addEventListener("submit",validateForm);

function validateForm(e) {
    e.preventDefault();

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value.trim();

    if(name === ""){
        alert("Name empty");
        return;
    }

    if(email === "" && email.indexOf("@") != -1 || email.indexOf("@") != 0 || email.indexOf("@")!=email.length){
        alert("Email empty");
        return;
    }

    if(password === ""){
        alert("Password empty");
        return;
    }

    let gender = document.querySelector('input[name="gender"]:checked');
    if(gender == null){
        alert("Gender not given");
        return;
    }

    gender = gender.value;

    let country = document.getElementById("country").value.trim();
    if(country === ""){
        alert("Country not given");
        return;
    }

    let isTermsChecked = document.getElementById("subscribe").checked;
    if(!isTermsChecked){
        alert("Terms not agreed");
        return;
    }


    const user = {
        name,
        email,
        password,
        gender,
        country,
        isTermsChecked
    }

    console.log(user);

    alert("Registration successful");

}