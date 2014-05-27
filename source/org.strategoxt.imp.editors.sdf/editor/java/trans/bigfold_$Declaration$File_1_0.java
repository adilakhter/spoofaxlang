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

@SuppressWarnings("all") public class bigfold_$Declaration$File_1_0 extends Strategy 
{ 
  public static bigfold_$Declaration$File_1_0 instance = new bigfold_$Declaration$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_92099)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_DeclarationFile_1_0");
    Fail76251:
    { 
      IStrategoTerm j_92099 = null;
      IStrategoTerm n_92099 = null;
      IStrategoTerm p_92099 = null;
      j_92099 = term;
      p_92099 = term;
      Success41841:
      { 
        Fail76252:
        { 
          IStrategoTerm r_92099 = null;
          r_92099 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_92099, trans.const15524, j_92099);
          if(term == null)
            break Fail76252;
          if(true)
            break Success41841;
        }
        term = trans.constNil11;
      }
      n_92099 = term;
      term = p_92099;
      term = termFactory.makeTuple(n_92099, term);
      term = m_92099.invoke(context, term, lifted21632.instance);
      if(term == null)
        break Fail76251;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}