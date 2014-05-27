package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigfold_$Is$Imported$Failed_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Imported$Failed_1_0 instance = new bigfold_$Is$Imported$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4877)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImportedFailed_1_0");
    Fail23668:
    { 
      IStrategoTerm w_4877 = null;
      IStrategoTerm a_4878 = null;
      IStrategoTerm c_4878 = null;
      w_4877 = term;
      c_4878 = term;
      Success12667:
      { 
        Fail23669:
        { 
          IStrategoTerm e_4878 = null;
          e_4878 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4878, trans.const4576, w_4877);
          if(term == null)
            break Fail23669;
          if(true)
            break Success12667;
        }
        term = trans.constNil4;
      }
      a_4878 = term;
      term = c_4878;
      term = termFactory.makeTuple(a_4878, term);
      term = z_4877.invoke(context, term, lifted7066.instance);
      if(term == null)
        break Fail23668;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}