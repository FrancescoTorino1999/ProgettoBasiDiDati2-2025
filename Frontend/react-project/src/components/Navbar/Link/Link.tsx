import './Link.scss'

function Link(props: any) {

  return (
    <>
     <a className = "link" href = {props.href ? props.href : '/#'}>

        {props.linkText ? props.linkText : ""}
        
     </a>
    </>
  )
}

export default Link