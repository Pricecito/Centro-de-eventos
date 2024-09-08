const btnSignIn = document.getElementById("sign-in"),
        btnSignUp = document.getElementById("sign-up"),
        formRegister = document.querySelector(".register"),
        formLogin = document.querySelector(".login");


btnSignIn.addEventListener("click", e=>{
    formRegister.classList.add("hide");
    formLogin.classList.remove("hide")
    formRegister.scrollIntoView({ behavior: "smooth" })
})

btnSignUp.addEventListener("click" , e=>{
    formLogin.classList.add("hide");
    formRegister.classList.remove("hide")

})

(() => {
'use strict'

// Fetch all the forms we want to apply custom Bootstrap validation styles to
const forms = document.querySelectorAll('.needs-validation')

// Loop over them and prevent submission
Array.from(forms).forEach(form => {
  form.addEventListener('submit', event => {
    if (!form.checkValidity()) {
      event.preventDefault()
      event.stopPropagation()
    }

    form.classList.add('was-validated')
  }, false)
})
})()

