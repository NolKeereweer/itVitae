import { useState } from 'react'
import './App.css'
import Test from './components/Test'
import Banaan from './components/Banaan'
import axios from 'axios'

function App() {
  const [eigId, setEigId] = useState('')
  const [result, setResult] = useState('');

  const getHandler = async () => {
    const res = await axios.get("http://localhost:8080/api/eigenaar/findall");
    setResult(res.data[eigId-1]?.name ?? "Niet gevonden.");
  }

  return (
    <>
      <Test naam="Tommie"/>
      <Banaan/>
      <form onSubmit={e => {
        e.preventDefault();
        getHandler();
      }}>
        <input type='text' placeholder='eigenaar id' onChange={e => setEigId(e.target.value)}></input>
        <button type='sumbit'>Submit</button>
      </form>
      <em>{result}</em>
    </>
  )
}

export default App
