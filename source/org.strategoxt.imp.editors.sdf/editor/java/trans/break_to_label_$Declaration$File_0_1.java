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

@SuppressWarnings("all") public class break_to_label_$Declaration$File_0_1 extends Strategy 
{ 
  public static break_to_label_$Declaration$File_0_1 instance = new break_to_label_$Declaration$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_92099)
  { 
    context.push("break_to_label_DeclarationFile_0_1");
    Fail76248:
    { 
      IStrategoTerm d_92099 = null;
      d_92099 = term;
      term = dr_break_0_2.instance.invoke(context, d_92099, trans.const15524, b_92099);
      if(term == null)
        break Fail76248;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}