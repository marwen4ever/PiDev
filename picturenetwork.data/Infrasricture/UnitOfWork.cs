﻿using picturenetwork.data.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace picturenetwork.data.Infrasricture
{
    public class UnitOfWork : IUnitOfWork
    {
        IDatabaseFactory dbFactory;
        picturenetworkContext dataContext;

        public picturenetworkContext DataContext
        {
            get { return dataContext = dbFactory.DataContext; }
        }


        public UnitOfWork(IDatabaseFactory dbFactory)
        {
            this.dbFactory = dbFactory;
        }
        public void Commit()
        {
            DataContext.SaveChanges();
        }

        private ISubjectRepository subjectRepository;
        public ISubjectRepository SubjectRepository
        {
            get { return subjectRepository = new SubjectRepository(dbFactory); }
        }

        private ICommentRepository commentRepository;
        public ICommentRepository CommentRepository
        {
            get { return commentRepository = new CommentRepository(dbFactory); }
        }


        private IPhotoRepository photoRepository;
        public IPhotoRepository PhotoRepository
        {
            get { return photoRepository = new PhotoRepository(dbFactory); }
        }

        private IClaimRepository claimRepository;
        public IClaimRepository ClaimRepository
        {
            get { return claimRepository = new ClaimRepository(dbFactory); }
        }
        private IEventRepository eventRepository;
        public IEventRepository EventRepository 
        {
            get { return eventRepository = new EventRepository(dbFactory); }
        }



        public void Dispose()
        {
            dbFactory.Dispose();
        }


        
    }
    
}
