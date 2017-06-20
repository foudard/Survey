/**
 * Created by flori_000 on 24/05/2017.
 */
'use strict'

// number of results to send
var results = 2

const send_response = document.querySelector('#responses')
const save = document.querySelector('#create')
const nb_res = document.querySelectorAll('.results')
const responses = document.querySelectorAll('.response')

nb_res.forEach(function (element) {
    element.addEventListener('click', function ({target}) {
        var result = target.querySelector('input[name=nb_res]').value
        results = result
        var items = new Array()
        for (var i = 0; i <= nb_res.length; i++) {
            if (i <= parseInt(result) - 1) {
                responses[i].classList.remove('hidden')
                items.push({ value: responses[i].value })
            }
            else responses[i].classList.add('hidden')
        }
        items = JSON.stringify(items)
        send_response.value = items
    })
})

responses.forEach(function (element) {
    element.addEventListener('change', function () {
        var items = new Array()
        for (var i = 0; i <= nb_res.length; i++) {
            if (i <= parseInt(results) - 1) {
                responses[i].classList.remove('hidden')
                items.push({ value: responses[i].value })
            }
            else responses[i].classList.add('hidden')
        }
        items = JSON.stringify(items)
        send_response.value = items
    })
})

const dates = document.querySelectorAll('input[type=date]')
dates.forEach(function (date) {
    date.addEventListener('change', function ({target}) {
        if (target.value.split('/').length !== 3) return save.setAttribute('disabled', 'disabled')

        const currentDate = new Date()
        const year = target.value.split('/')[2]
        const month = target.value.split('/')[1]
        const day = target.value.split('/')[0]
        const isYear = parseInt(year) >= currentDate.getFullYear()

        if (year.length !== 4 || !isYear) {
            return save.setAttribute('disabled', 'disabled')
        }
        if (month.length !== 2) {
            return save.setAttribute('disabled', 'disabled')
        }
        if (day.length !== 2) {
            return save.setAttribute('disabled', 'disabled')
        }
        return save.removeAttribute('disabled')
    })
})
