import React, { useEffect, useState } from 'react';
// import axios from 'axios';

function Desk() {
    const [ticket, setTicket] = useState([]);

    useEffect(() => {
        // fetch('http://localhost:8084/greeting')
        //     .then(response => response.json())
        //     .then(resData => setTicket(resData)
        //     )

        // axios(`http://localhost:8084/greeting`,
        //     {
        //         method: 'GET',
        //         headers: {
        //             'Access-Control-Allow-Origin': '*',
        //             'Content-Type': 'application/json',
        //             mode: 'no-cors'
        //         }
        //     })
        //     .then(resData => setTicket(resData))
        const arr = [
            { id: 1, content: '1111' },
            { id: 2, content: '1211' },
            { id: 3, content: '1131' },
            { id: 4, content: '1114' },
        ]
        setTicket(arr)
    }, [])

    console.log('ticket', ticket);


    return (
        <div>
            <h1>Desk</h1>
            {ticket.map(el => (
                <div key={el.id}>
                    <h2>{el.id}</h2>
                    <h2>{el.content}</h2>
                </div>
            ))}

        </div>
    );

}

export default Desk;