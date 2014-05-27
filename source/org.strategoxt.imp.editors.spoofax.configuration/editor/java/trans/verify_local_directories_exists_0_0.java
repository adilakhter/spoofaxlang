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
    Fail22800:
    { 
      IStrategoTerm term12154 = term;
      Success12145:
      { 
        Fail22801:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail22801;
          term = trans.constNil4;
          if(true)
            break Success12145;
        }
        term = term12154;
        IStrategoTerm j_4615 = null;
        IStrategoTerm k_4615 = null;
        IStrategoTerm o_4615 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail22800;
        j_4615 = ((IStrategoList)term).head();
        k_4615 = ((IStrategoList)term).tail();
        IStrategoTerm term12155 = term;
        Success12146:
        { 
          Fail22802:
          { 
            if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
              break Fail22802;
            { 
              if(true)
                break Fail22800;
              if(true)
                break Success12146;
            }
          }
          term = term12155;
        }
        term = verify_local_directory_exist_0_0.instance.invoke(context, j_4615);
        if(term == null)
          break Fail22800;
        o_4615 = term;
        term = this.invoke(context, k_4615);
        if(term == null)
          break Fail22800;
        term = termFactory.makeTuple(o_4615, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22800;
        term = flatten_list_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22800;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}