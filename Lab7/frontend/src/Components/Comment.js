import {useEffect, useState} from "react";
import axios from "../Config/api";

const Comment = ({postID}) => {
    const [comments, setComments] = useState([]);
    useEffect(() => {
        axios.get(`posts/${postID}/comments`)
            .then(res => setComments(res.data))
            .catch(err => console.log(err))
    }, [postID]);

    if (comments.length === 0) {
        return null;
    }

    return <div className={`comments-block p-2`}>
        <p>There are {comments.length} comment(s):</p>
        <ul>
            {comments.map( comment => {
                return <li>{comment.name} <i className={`fa fa-trash-o float-end`} title={`Delete this comment`} /> </li>
            })}
        </ul>
    </div>
}

export default Comment;