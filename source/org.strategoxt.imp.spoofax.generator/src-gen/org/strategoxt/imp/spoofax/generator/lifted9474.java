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

@SuppressWarnings("all") final class lifted9474 extends Strategy 
{ 
  public static final lifted9474 instance = new lifted9474();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28602:
    { 
      IStrategoTerm term10658 = term;
      Success11332:
      { 
        Fail28603:
        { 
          term = $Conc$Term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28603;
          if(true)
            break Success11332;
        }
        term = term10658;
        IStrategoTerm term10659 = term;
        Success11333:
        { 
          Fail28604:
          { 
            term = $Cons$Term_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28604;
            if(true)
              break Success11333;
          }
          term = term10659;
          IStrategoTerm term10660 = term;
          Success11334:
          { 
            Fail28605:
            { 
              term = $Nil$Term_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28605;
              if(true)
                break Success11334;
            }
            term = $Tuple$Term_1_0.instance.invoke(context, term10660, _Id.instance);
            if(term == null)
              break Fail28602;
          }
        }
      }
      IStrategoTerm term10661 = term;
      Success11335:
      { 
        Fail28606:
        { 
          term = $Cons$Term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28606;
          { 
            if(true)
              break Fail28602;
            if(true)
              break Success11335;
          }
        }
        term = term10661;
      }
      if(true)
        return term;
    }
    return null;
  }
}