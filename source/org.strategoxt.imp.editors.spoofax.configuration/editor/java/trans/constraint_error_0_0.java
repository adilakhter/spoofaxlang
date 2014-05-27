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

@SuppressWarnings("all") public class constraint_error_0_0 extends Strategy 
{ 
  public static constraint_error_0_0 instance = new constraint_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("constraint_error_0_0");
    Fail87606:
    { 
      IStrategoTerm term47240 = term;
      IStrategoConstructor cons2012 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success47231:
      { 
        if(cons2012 == Main._consSpxProjects_1)
        { 
          Fail87607:
          { 
            IStrategoTerm f_17559 = null;
            f_17559 = term.getSubterm(0);
            term = verify_project_references_0_0.instance.invoke(context, f_17559);
            if(term == null)
              break Fail87607;
            if(true)
              break Success47231;
          }
          term = term47240;
        }
        if(cons2012 == Main._consSource_2)
        { 
          IStrategoTerm e_17559 = null;
          e_17559 = term.getSubterm(0);
          term = (IStrategoTerm)termFactory.makeListCons(e_17559, (IStrategoList)trans.constNil14);
          term = verify_local_directories_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87606;
        }
        else
        { 
          break Fail87606;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}