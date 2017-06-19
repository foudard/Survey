/**
 * Created by flori_000 on 24/05/2017.
 */
'use strict'

const nb_res = document.querySelectorAll('input[name=nb_res]')
const responses = document.querySelectorAll('.response')
console.log(responses)

nb_res.forEach(function (element) {
    element.addEventListener('click', function () {
        for (var i = 0; i < nb_res.length; i++) {
            if (i <= parseInt(element.value)-1) {
                responses[i].classList.remove('hidden')
            }
            else responses[i].classList.add('hidden')
        }
    })
})
