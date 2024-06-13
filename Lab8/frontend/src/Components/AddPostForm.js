import {useRef, useState} from "react";
import axios from "../Config/api";

const AddPostForm = ({reloadPostsHandler}) => {

    const [error, setError] = useState("");
    const formRef = useRef({});

    const checkInputs = formInputs => {

        if ( formInputs.title === '' || formInputs.content ==='' || formInputs.author === '') {
            setError("Fields should not be empty");
            return false;
        }

        return true;
    }

    const savePost = () => {

        const form = {
            title: formRef.current.title.value,
            content: formRef.current.content.value,
            author: formRef.current.author.value
        };

        if (!checkInputs(form)) {
            console.log(form);
            return false;
        }

        axios.post("posts", form)
            .then(res => {
                formRef.current.title.value='';
                formRef.current.content.value='';
                formRef.current.author.value='';
                reloadPostsHandler();
            })
            .catch(err => console.log(err))
    }

    return <div className={`col-12`}>
        <div className={`py-5`}>
            <form>
                <div className="form-group mb-2">
                    <label htmlFor={`PostTitle`}>Title</label>
                    <input
                        id={`PostTitle`}
                        ref={el=> (formRef.current.title=el)}
                        className="form-control"
                        type="text"
                        name="title"/>
                </div>
                <div className="form-group mb-2">
                    <label htmlFor={`PostContent`}>Content</label>
                    <textarea
                        id={`PostContent`}
                        className="form-control"
                        ref={el=> (formRef.current.content=el)}
                        name="content"/>
                </div>
                <div className="form-group mb-2">
                    <label htmlFor={`PostAuthor`}>Author</label>
                    <input
                        id={`PostAuthor`}
                        ref={el=> (formRef.current.author=el)}
                        className="form-control"
                        type="text"
                        name="author"/>
                </div>
                {error && <p className={`error-text`}>{error}</p>}
                <button
                    onClick={e => savePost()}
                    className="btn btn-outline-primary float-end"
                    type="button">Save
                </button>
            </form>
        </div>
    </div>
}

export default AddPostForm;