package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9047 extends Strategy 
{ 
  public static final lifted9047 instance = new lifted9047();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28997:
    { 
      IStrategoTerm term10065 = term;
      Success11418:
      { 
        Fail28998:
        { 
          if(term.getTermType() != IStrategoTerm.STRING || !"Productions".equals(((IStrategoString)term).stringValue()))
            break Fail28998;
          if(true)
            break Success11418;
        }
        term = term10065;
        IStrategoTerm term10066 = term;
        Success11419:
        { 
          Fail28999:
          { 
            if(term.getTermType() != IStrategoTerm.STRING || !"Symbols".equals(((IStrategoString)term).stringValue()))
              break Fail28999;
            if(true)
              break Success11419;
          }
          term = term10066;
          IStrategoTerm term10067 = term;
          Success11420:
          { 
            Fail29000:
            { 
              if(term.getTermType() != IStrategoTerm.STRING || !"Priorities".equals(((IStrategoString)term).stringValue()))
                break Fail29000;
              if(true)
                break Success11420;
            }
            term = term10067;
            IStrategoTerm term10068 = term;
            Success11421:
            { 
              Fail29001:
              { 
                if(term.getTermType() != IStrategoTerm.STRING || !"Restrictions".equals(((IStrategoString)term).stringValue()))
                  break Fail29001;
                if(true)
                  break Success11421;
              }
              term = term10068;
              if(term.getTermType() != IStrategoTerm.STRING || !"Aliases".equals(((IStrategoString)term).stringValue()))
                break Fail28997;
            }
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}