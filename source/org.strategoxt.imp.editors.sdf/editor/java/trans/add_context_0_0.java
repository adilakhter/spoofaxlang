package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class add_context_0_0 extends Strategy 
{ 
  public static add_context_0_0 instance = new add_context_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("add_context_0_0");
    Fail76089:
    { 
      IStrategoTerm term41876 = term;
      Success41796:
      { 
        Fail76090:
        { 
          IStrategoTerm h_92075 = null;
          h_92075 = term;
          IStrategoTerm term41877 = term;
          Success41797:
          { 
            Fail76091:
            { 
              term = oncetd_1_0.instance.invoke(context, term, lifted21578.instance);
              if(term == null)
                break Fail76091;
              { 
                if(true)
                  break Fail76090;
                if(true)
                  break Success41797;
              }
            }
            term = term41877;
          }
          term = h_92075;
          { 
            IStrategoTerm term41878 = term;
            Success41798:
            { 
              Fail76092:
              { 
                IStrategoTerm i_92075 = null;
                i_92075 = term;
                term = is_list_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail76092;
                term = i_92075;
                { 
                  term = termFactory.makeAppl(Main._conscontext_free_syntax_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success41798;
                }
              }
              term = term41878;
              term = termFactory.makeAppl(Main._conscontext_free_syntax_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil11)});
            }
            if(true)
              break Success41796;
          }
        }
        term = term41876;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}