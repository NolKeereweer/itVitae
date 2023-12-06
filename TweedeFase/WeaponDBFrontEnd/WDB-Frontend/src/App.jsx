import { useState } from 'react'
import './App.css'
import axios from 'axios'
import Banaan from './components/Banaan'

function App() {
  const [result, setResult] = useState('')

  const getHandler = async () => {
    const res = await axios.get();
    setResult(res.data[])
  }

  return (
    <>
      
    </>
  )
}

export default App
