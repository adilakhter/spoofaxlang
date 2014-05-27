package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class verify_local_directories_exists_0_0 extends Strategy 
{ 
  public static verify_local_directories_exists_0_0 instance = new verify_local_directories_exists_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("verify_local_directories_exists_0_0");
    Fail87608:
    { 
      IStrategoTerm term47241 = term;
      Success47232:
      { 
        Fail87609:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail87609;
          term = trans.constNil14;
          if(true)
            break Success47232;
        }
        term = term47241;
        IStrategoTerm g_17559 = null;
        IStrategoTerm h_17559 = null;
        IStrategoTerm l_17559 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail87608;
        g_17559 = ((IStrategoList)term).head();
        h_17559 = ((IStrategoList)term).tail();
        IStrategoTerm term47242 = term;
        Success47233:
        { 
          Fail87610:
          { 
            if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
              break Fail87610;
            { 
              if(true)
                break Fail87608;
              if(true)
                break Success47233;
            }
          }
          term = term47242;
        }
        term = verify_local_directory_exist_0_0.instance.invoke(context, g_17559);
        if(term == null)
          break Fail87608;
        l_17559 = term;
        term = this.invoke(context, h_17559);
        if(term == null)
          break Fail87608;
        term = termFactory.makeTuple(l_17559, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail87608;
        term = flatten_list_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail87608;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}