import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container } from '@mui/system';
import { Paper } from '@mui/material';
import { useEffect, useState } from 'react';
import { Button } from '@mui/material';

export default function Pepo() {
    const paperStyle = { padding: "50px 20px", width: 600, margin: "20px auto" }
    const [nom, setNom] = useState('');
    const [pepo, setPepo] = useState([]);


    const handleClick = (e) => {
        e.preventDefault()
        const pepo = { nom }
        console.log(pepo)
        fetch("http://localhost:8080/pepo/add", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(pepo)

        }).then(() => {
            console.log("New Student added")
        })
    }

    useEffect(() => {
        fetch("http://localhost:8080/pepo/getAll")
            .then(res => res.json())
            .then((result) => {
                setPepo(result);
            }
            )
    }, [])

    return (

        <Container>
            <Paper elevation={3} style={paperStyle}>
                <h1 style={{ color: "blue", fontFamily: "fantasy" }}><u>Agregame el guri</u></h1>
                <Box
                    component="form"
                    sx={{
                        '& > :not(style)': { m: 1, width: '25ch' },
                    }}
                    noValidate
                    autoComplete="off"
                >
                    <TextField id="standard-basic" label="Nombreton" variant="standard" fullWidth
                        value={nom}
                        onChange={(e) => setNom(e.target.value)}
                    />
                    <Button variant="contained" onClick={handleClick}>Contained</Button>
                </Box>
            </Paper>
            <h1>Students</h1>

            <Paper elevation={3} style={paperStyle}>

                {pepo.map(pepo => (
                    <Paper elevation={6} style={{ margin: "10px", padding: "15px", textAlign: "left" }} key={pepo.id}>
                        Id:{pepo.id}<br />
                        Name:{pepo.nom}

                    </Paper>
                ))
                }
            </Paper>
        </Container>
    );
}
