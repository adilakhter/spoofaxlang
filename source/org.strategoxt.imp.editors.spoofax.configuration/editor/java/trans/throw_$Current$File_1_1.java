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

@SuppressWarnings("all") public class throw_$Current$File_1_1 extends Strategy 
{ 
  public static throw_$Current$File_1_1 instance = new throw_$Current$File_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4638, IStrategoTerm b_4638)
  { 
    context.push("throw_CurrentFile_1_1");
    Fail22978:
    { 
      IStrategoTerm e_4638 = null;
      e_4638 = term;
      term = dr_throw_1_2.instance.invoke(context, e_4638, c_4638, b_4638, trans.const4485);
      if(term == null)
        break Fail22978;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}